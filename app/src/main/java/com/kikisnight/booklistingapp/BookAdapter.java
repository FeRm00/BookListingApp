package com.kikisnight.booklistingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/**
 * {@link BookAdapter} is an {@link BookAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Book} objects.
 */

public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(Context context, List<Book> bookList) {
        super(context, 0, bookList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_list_item, parent, false);
        }

        // Find the book at the given position in the list of books
        Book currentBook = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID tittle
        TextView tittleView = (TextView) listItemView.findViewById(R.id.tittle);
        // Get the tittle of the book from the current Book object and set this text on
        // the Tittle TextView.
        tittleView.setText(currentBook.getTittle());

        // Find the TextView in the list_item.xml layout with the ID author.
        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
        // Get the author of the book from the currentBook object and set this text on
        // the author TextView.
        authorView.setText(currentBook.getAuthor());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }

}
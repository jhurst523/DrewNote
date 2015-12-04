package edu.drew.note;

public class BSTreeIterative implements NoteCollection {

	@Override
	public boolean add(Note newNote) {
		return false;
	}

	@Override
	public Note lookup(long ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(long ID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Note note) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(Note note) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(long ID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Note[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	private class Node<T>
	   {
	      private T data;
	      private Node<T> left, right;

	      public Node(T data, Node<T> l, Node<T> r)
	      {
	         left = l; right = r;
	         this.data = data;
	      }

	      public Node(T data)
	      {
	         this(data, null, null);
	      }

	      public String toString()
	      {
	         return data.toString();
	      }
	   } 
	
}


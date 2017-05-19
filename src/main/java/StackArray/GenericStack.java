package StackArray;

import java.lang.reflect.Array;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;

    public GenericStack()
	{
		elements = (E[]) new Object[0];
	}

    public void push(E element)
	{
		E[] tempelements = (E[]) new Object[elements.length + 1];
		int count = 0;
		for (E i : elements)
		{
			tempelements[count + 1] = i;
			count++;
		}
		tempelements[elements.length - elements.length] = element;
		elements = tempelements;
	}

	public boolean isEmpty()
	{
		return elements.length == 0;
	}

	public E pop()
	{
		E element = elements[elements.length - 1];
		E[] tempelements = (E[]) new Object[elements.length - 1];
		for (int i = 0; i < elements.length - 2; i++)
		{
			tempelements[i] = elements[i];
		}
		return element;
	}
}

package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E>
{
    private ArrayList elements;


    public Stack()
	{
		elements = new ArrayList();
    }

    public void push(E element)
	{
		elements.add(element);
	}

	public boolean isEmpty()
	{
		return elements.size() == 0;
	}

	public E pop()
	{
		E element = (E) elements.get(elements.size() - 1);
		elements.remove(elements.size() - 1);
		return element;
	}
}

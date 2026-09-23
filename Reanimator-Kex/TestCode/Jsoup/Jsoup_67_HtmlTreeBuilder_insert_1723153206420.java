package org.jsoup.parser;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.StringBuilder;

public class HtmlTreeBuilder_insert_1723153206420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280147;
     Object term280319;

    public HtmlTreeBuilder_insert_1723153206420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term280253 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term280199 = new ArrayList();
        ((ArrayList) term280199).add(term280253);
        term280147 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term280147, term280147.getClass(), "stack", term280199);
        setBooleanField(term280147, term280147.getClass(), "fosterInserts", true);
        char[] term279965 = (char[]) newCharArray(8);
        setCharElement(term279965, 0, (char) 32);
        setCharElement(term279965, 1, 'm');
        setCharElement(term279965, 2, 'm');
        setCharElement(term279965, 3, 'm');
        setCharElement(term279965, 4, 'm');
        setCharElement(term279965, 5, 'm');
        setCharElement(term279965, 6, 'm');
        setCharElement(term279965, 7, 'm');
        StringBuilder term280379 = new StringBuilder();
        ((StringBuilder) term280379).append(term279965);
        term280319 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term280319, term280319.getClass(), "data", term280379);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term280319;
        try {
            callMethod(klass, "insert", argTypes, term280147, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



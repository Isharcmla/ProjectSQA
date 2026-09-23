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
import java.util.LinkedList;
import java.lang.Object;
import java.util.ArrayList;

public class Parser_addChildToParent_715844109107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58581;
     Object term58777;

    public Parser_addChildToParent_715844109107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term58635 = new LinkedList();
        term58581 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term58581, term58581.getClass(), "stack", term58635);
        setField(term58581, term58581.getClass(), "baseUri", "");
        Object term58898 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        ArrayList term58852 = new ArrayList();
        ((ArrayList) term58852).add(term58898);
        term58777 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term58800 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term58800, term58800.getClass(), "ancestors", term58852);
        setBooleanField(term58800, term58800.getClass(), "canContainBlock", false);
        setField(term58777, term58777.getClass(), "tag", term58800);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term58777;
        args[1] = false;
        try {
            callMethod(klass, "addChildToParent", argTypes, term58581, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



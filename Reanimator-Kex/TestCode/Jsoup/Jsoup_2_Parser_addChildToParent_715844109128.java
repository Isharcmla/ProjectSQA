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

public class Parser_addChildToParent_715844109128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72305;
     Object term72501;

    public Parser_addChildToParent_715844109128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term72359 = new LinkedList();
        term72305 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term72305, term72305.getClass(), "stack", term72359);
        setField(term72305, term72305.getClass(), "baseUri", "byte");
        Object term72622 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        ArrayList term72576 = new ArrayList();
        ((ArrayList) term72576).add(term72622);
        term72501 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term72524 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term72524, term72524.getClass(), "ancestors", term72576);
        setBooleanField(term72524, term72524.getClass(), "canContainBlock", true);
        setBooleanField(term72524, term72524.getClass(), "canContainInline", true);
        setField(term72501, term72501.getClass(), "tag", term72524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term72501;
        args[1] = false;
        try {
            callMethod(klass, "addChildToParent", argTypes, term72305, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



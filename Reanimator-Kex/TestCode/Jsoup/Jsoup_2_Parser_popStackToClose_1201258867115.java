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

public class Parser_popStackToClose_1201258867115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62829;

    public Parser_popStackToClose_1201258867115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term62973 = newInstance(Class.forName("java.lang.Object"));
        Object term63011 = newInstance(Class.forName("java.lang.Object"));
        Object term63065 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term63088 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term63088, term63088.getClass(), "canContainBlock", false);
        setField(term63065, term63065.getClass(), "tag", term63088);
        LinkedList term62883 = new LinkedList();
        ((LinkedList) term62883).add(term62973);
        ((LinkedList) term62883).add(term63011);
        ((LinkedList) term62883).add((Object)null);
        ((LinkedList) term62883).add(term63065);
        term62829 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term62829, term62829.getClass(), "stack", term62883);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "popStackToClose", argTypes, term62829, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



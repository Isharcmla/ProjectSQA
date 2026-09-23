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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.util.LinkedList;
import java.lang.Object;

public class Parser_popStackToClose_1201258867105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57512;
     Object term57821;

    public Parser_popStackToClose_1201258867105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term57656 = newInstance(Class.forName("java.lang.Object"));
        Object term57710 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term57733 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term57733, term57733.getClass(), "canContainBlock", false);
        setField(term57710, term57710.getClass(), "tag", term57733);
        LinkedList term57566 = new LinkedList();
        ((LinkedList) term57566).add(term57656);
        ((LinkedList) term57566).add(term57710);
        term57512 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term57512, term57512.getClass(), "stack", term57566);
        Object term57824 = newInstance(Class.forName("java.lang.Object"));
        Object term57826 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term57826, term57826.getClass(), "tag", null);
        setField(term57826, term57826.getClass(), "classNames", null);
        setField(term57826, term57826.getClass(), "parentNode", null);
        setField(term57826, term57826.getClass(), "childNodes", null);
        setField(term57826, term57826.getClass(), "attributes", null);
        setField(term57826, term57826.getClass(), "baseUri", null);
        LinkedList term57822 = new LinkedList();
        ((LinkedList) term57822).add(term57824);
        ((LinkedList) term57822).add(term57826);
        term57821 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term57821, term57821.getClass(), "stack", term57822);
        setField(term57821, term57821.getClass(), "tq", null);
        setField(term57821, term57821.getClass(), "doc", null);
        setField(term57821, term57821.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "popStackToClose", argTypes, term57512, args);
        assertTrue(recursiveEquals(term57512, term57821));
        assertTrue(recursiveEquals(retValue, null));
    }

};



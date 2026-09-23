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

public class Parser_popStackToClose_120125886799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54813;
     Object term55171;

    public Parser_popStackToClose_120125886799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term55011 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term55034 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term55034, term55034.getClass(), "canContainBlock", false);
        setField(term55011, term55011.getClass(), "tag", term55034);
        LinkedList term54867 = new LinkedList();
        ((LinkedList) term54867).add("kex.java.util.LinkedList");
        ((LinkedList) term54867).add(term55011);
        term54813 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term54813, term54813.getClass(), "stack", term54867);
        Object term55177 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term55177, term55177.getClass(), "tag", null);
        setField(term55177, term55177.getClass(), "classNames", null);
        setField(term55177, term55177.getClass(), "parentNode", null);
        setField(term55177, term55177.getClass(), "childNodes", null);
        setField(term55177, term55177.getClass(), "attributes", null);
        setField(term55177, term55177.getClass(), "baseUri", null);
        LinkedList term55172 = new LinkedList();
        ((LinkedList) term55172).add("kex.java.util.LinkedList");
        ((LinkedList) term55172).add(term55177);
        term55171 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term55171, term55171.getClass(), "stack", term55172);
        setField(term55171, term55171.getClass(), "tq", null);
        setField(term55171, term55171.getClass(), "doc", null);
        setField(term55171, term55171.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "popStackToClose", argTypes, term54813, args);
        assertTrue(recursiveEquals(term54813, term55171));
        assertTrue(recursiveEquals(retValue, null));
    }

};



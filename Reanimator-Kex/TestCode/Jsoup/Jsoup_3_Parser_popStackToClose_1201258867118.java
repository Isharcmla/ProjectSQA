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

public class Parser_popStackToClose_1201258867118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78485;
     Object term79447;

    public Parser_popStackToClose_1201258867118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78629 = newInstance(Class.forName("java.lang.Object"));
        Object term78683 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term78706 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term78706, term78706.getClass(), "canContainBlock", false);
        setField(term78683, term78683.getClass(), "tag", term78706);
        LinkedList term78539 = new LinkedList();
        ((LinkedList) term78539).add(term78629);
        ((LinkedList) term78539).add(term78683);
        term78485 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term78485, term78485.getClass(), "stack", term78539);
        Object term79450 = newInstance(Class.forName("java.lang.Object"));
        Object term79452 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term79452, term79452.getClass(), "tag", null);
        setField(term79452, term79452.getClass(), "classNames", null);
        setField(term79452, term79452.getClass(), "parentNode", null);
        setField(term79452, term79452.getClass(), "childNodes", null);
        setField(term79452, term79452.getClass(), "attributes", null);
        setField(term79452, term79452.getClass(), "baseUri", null);
        LinkedList term79448 = new LinkedList();
        ((LinkedList) term79448).add(term79450);
        ((LinkedList) term79448).add(term79452);
        term79447 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term79447, term79447.getClass(), "stack", term79448);
        setField(term79447, term79447.getClass(), "tq", null);
        setField(term79447, term79447.getClass(), "doc", null);
        setField(term79447, term79447.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "popStackToClose", argTypes, term78485, args);
        assertTrue(recursiveEquals(term78485, term79447));
        assertTrue(recursiveEquals(retValue, null));
    }

};



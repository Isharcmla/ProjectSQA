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
import java.lang.ClassCastException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class Parser_popStackToClose_120125886783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46595;

    public Parser_popStackToClose_120125886783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term46739 = newInstance(Class.forName("java.lang.Object"));
        Object term46793 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term46839 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term46793, term46793.getClass(), "tag", term46839);
        LinkedList term46649 = new LinkedList();
        ((LinkedList) term46649).add(term46739);
        ((LinkedList) term46649).add(term46739);
        ((LinkedList) term46649).add(term46739);
        ((LinkedList) term46649).add(term46739);
        ((LinkedList) term46649).add(term46739);
        ((LinkedList) term46649).add(term46739);
        ((LinkedList) term46649).add(term46739);
        ((LinkedList) term46649).add(term46739);
        ((LinkedList) term46649).add(term46739);
        ((LinkedList) term46649).add(term46739);
        ((LinkedList) term46649).add(term46739);
        ((LinkedList) term46649).add(term46793);
        term46595 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term46595, term46595.getClass(), "stack", term46649);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "popStackToClose", argTypes, term46595, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};



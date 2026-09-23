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

public class Parser_stackHasValidParent_662307900103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65430;
     Object term65597;

    public Parser_stackHasValidParent_662307900103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term65484 = new LinkedList();
        ((LinkedList) term65484).add("kex.java.util.ArrayList");
        term65430 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term65430, term65430.getClass(), "stack", term65484);
        term65597 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term65597, term65597.getClass(), "canContainBlock", false);
        setBooleanField(term65597, term65597.getClass(), "canContainInline", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term65597;
        try {
            callMethod(klass, "stackHasValidParent", argTypes, term65430, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};



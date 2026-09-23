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
import java.lang.Object;
import java.util.ArrayList;

public class XmlTreeBuilder_popStackToClose_55105062184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208364;
     Object term208584;

    public XmlTreeBuilder_popStackToClose_55105062184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term208520 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term208482 = new ArrayList();
        ((ArrayList) term208482).add(term208520);
        term208364 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term208430 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term208430, term208430.getClass(), "preserveTagCase", false);
        setField(term208364, term208364.getClass(), "settings", term208430);
        setField(term208364, term208364.getClass(), "stack", term208482);
        term208584 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term208584, term208584.getClass(), "tagName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term208584;
        try {
            callMethod(klass, "popStackToClose", argTypes, term208364, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};



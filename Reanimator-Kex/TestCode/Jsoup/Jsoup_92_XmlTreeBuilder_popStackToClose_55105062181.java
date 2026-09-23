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

public class XmlTreeBuilder_popStackToClose_55105062181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210630;
     Object term210850;

    public XmlTreeBuilder_popStackToClose_55105062181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term210786 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term210748 = new ArrayList();
        ((ArrayList) term210748).add(term210786);
        term210630 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term210696 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term210696, term210696.getClass(), "preserveTagCase", false);
        setField(term210630, term210630.getClass(), "settings", term210696);
        setField(term210630, term210630.getClass(), "stack", term210748);
        term210850 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term210850, term210850.getClass(), "tagName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term210850;
        try {
            callMethod(klass, "popStackToClose", argTypes, term210630, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};



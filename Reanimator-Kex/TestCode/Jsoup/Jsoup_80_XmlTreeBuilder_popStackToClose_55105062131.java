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
import java.lang.Object;

public class XmlTreeBuilder_popStackToClose_55105062131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172182;
     Object term172312;

    public XmlTreeBuilder_popStackToClose_55105062131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172182 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term172248 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term172182, term172182.getClass(), "settings", term172248);
        term172312 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term172312, term172312.getClass(), "tagName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term172312;
        try {
            callMethod(klass, "popStackToClose", argTypes, term172182, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



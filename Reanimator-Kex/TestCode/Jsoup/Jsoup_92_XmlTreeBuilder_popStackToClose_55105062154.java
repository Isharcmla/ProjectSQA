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

public class XmlTreeBuilder_popStackToClose_55105062154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197831;
     Object term197961;

    public XmlTreeBuilder_popStackToClose_55105062154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197831 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term197897 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term197831, term197831.getClass(), "settings", term197897);
        term197961 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term197961, term197961.getClass(), "tagName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term197961;
        try {
            callMethod(klass, "popStackToClose", argTypes, term197831, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



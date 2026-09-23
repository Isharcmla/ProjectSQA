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
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_504344543238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299757;
     Object term299889;

    public XmlTreeBuilder_insert_504344543238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term299757 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term299823 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term299823, term299823.getClass(), "preserveTagCase", false);
        setField(term299757, term299757.getClass(), "settings", term299823);
        StringBuilder term299949 = new StringBuilder();
        StringBuilder term300009 = new StringBuilder();
        StringBuilder term300069 = new StringBuilder();
        term299889 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term299889, term299889.getClass(), "name", term299949);
        setField(term299889, term299889.getClass(), "publicIdentifier", term300009);
        setField(term299889, term299889.getClass(), "systemIdentifier", term300069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term299889;
        try {
            callMethod(klass, "insert", argTypes, term299757, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



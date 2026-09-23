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

public class Parser_parseInput_37157704218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Parser_parseInput_37157704218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term3 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term7 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term1, term1.getClass(), "treeBuilder", null);
        setIntField(term1, term1.getClass(), "maxErrors", 1162663216);
        setIntField(term3, term3.getClass(), "maxSize", 0);
        setField(term3, term3.getClass(), "elementData", null);
        setIntField(term3, term3.getClass(), "size", 0);
        setIntField(term3, term3.getClass(), "modCount", 0);
        setField(term1, term1.getClass(), "errors", term3);
        setBooleanField(term7, term7.getClass(), "preserveTagCase", false);
        setBooleanField(term7, term7.getClass(), "preserveAttributeCase", false);
        setField(term1, term1.getClass(), "settings", term7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        try {
            callMethod(klass, "parseInput", argTypes, term1, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



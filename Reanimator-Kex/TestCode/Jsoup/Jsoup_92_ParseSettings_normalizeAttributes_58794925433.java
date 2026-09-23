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
import java.lang.Object;

public class ParseSettings_normalizeAttributes_58794925433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5332;
     Object term5390;
     Object term5451;
     Object term5452;
     Object term5441;

    public ParseSettings_normalizeAttributes_58794925433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5332 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term5332, term5332.getClass(), "preserveAttributeCase", false);
        term5390 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5235 = (Object[]) newArray("java.lang.String", 490);
        setIntField(term5390, term5390.getClass(), "size", 2);
        setElement(term5235, 1, "");
        setField(term5390, term5390.getClass(), "keys", term5235);
        term5451 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term5451, term5451.getClass(), "preserveTagCase", false);
        setBooleanField(term5451, term5451.getClass(), "preserveAttributeCase", false);
        term5452 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5453 = (Object[]) newArray("java.lang.String", 490);
        setIntField(term5452, term5452.getClass(), "size", 2);
        setElement(term5453, 0, "");
        setElement(term5453, 1, "");
        setField(term5452, term5452.getClass(), "keys", term5453);
        setField(term5452, term5452.getClass(), "vals", null);
        term5441 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5443 = (Object[]) newArray("java.lang.String", 490);
        setIntField(term5441, term5441.getClass(), "size", 2);
        setElement(term5443, 0, "");
        setElement(term5443, 1, "");
        setField(term5441, term5441.getClass(), "keys", term5443);
        setField(term5441, term5441.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.ParseSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term5390;
        Object retValue = callMethod(klass, "normalizeAttributes", argTypes, term5332, args);
        assertTrue(recursiveEquals(term5332, term5451));
        assertTrue(recursiveEquals(term5390, term5452));
        assertTrue(recursiveEquals(retValue, term5441));
    }

};



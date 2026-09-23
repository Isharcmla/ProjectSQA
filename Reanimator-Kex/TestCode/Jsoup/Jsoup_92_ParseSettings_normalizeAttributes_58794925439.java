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

public class ParseSettings_normalizeAttributes_58794925439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6234;
     Object term6292;
     Object term6359;
     Object term6360;
     Object term6347;

    public ParseSettings_normalizeAttributes_58794925439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6234 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term6234, term6234.getClass(), "preserveAttributeCase", false);
        term6292 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6129 = (Object[]) newArray("java.lang.String", 491);
        setIntField(term6292, term6292.getClass(), "size", 3);
        setElement(term6129, 2, "");
        setField(term6292, term6292.getClass(), "keys", term6129);
        term6359 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term6359, term6359.getClass(), "preserveTagCase", false);
        setBooleanField(term6359, term6359.getClass(), "preserveAttributeCase", false);
        term6360 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6361 = (Object[]) newArray("java.lang.String", 491);
        setIntField(term6360, term6360.getClass(), "size", 3);
        setElement(term6361, 0, "");
        setElement(term6361, 1, "");
        setElement(term6361, 2, "");
        setField(term6360, term6360.getClass(), "keys", term6361);
        setField(term6360, term6360.getClass(), "vals", null);
        term6347 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6349 = (Object[]) newArray("java.lang.String", 491);
        setIntField(term6347, term6347.getClass(), "size", 3);
        setElement(term6349, 0, "");
        setElement(term6349, 1, "");
        setElement(term6349, 2, "");
        setField(term6347, term6347.getClass(), "keys", term6349);
        setField(term6347, term6347.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.ParseSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term6292;
        Object retValue = callMethod(klass, "normalizeAttributes", argTypes, term6234, args);
        assertTrue(recursiveEquals(term6234, term6359));
        assertTrue(recursiveEquals(term6292, term6360));
        assertTrue(recursiveEquals(retValue, term6347));
    }

};



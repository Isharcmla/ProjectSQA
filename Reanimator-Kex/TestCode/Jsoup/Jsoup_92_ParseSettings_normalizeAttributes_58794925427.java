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

public class ParseSettings_normalizeAttributes_58794925427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2547;
     Object term2605;
     Object term2626;
     Object term2627;
     Object term2616;

    public ParseSettings_normalizeAttributes_58794925427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2547 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term2547, term2547.getClass(), "preserveAttributeCase", false);
        term2605 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2453 = (Object[]) newArray("java.lang.String", 490);
        setIntField(term2605, term2605.getClass(), "size", 2);
        setField(term2605, term2605.getClass(), "keys", term2453);
        term2626 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term2626, term2626.getClass(), "preserveTagCase", false);
        setBooleanField(term2626, term2626.getClass(), "preserveAttributeCase", false);
        term2627 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2628 = (Object[]) newArray("java.lang.String", 490);
        setIntField(term2627, term2627.getClass(), "size", 2);
        setElement(term2628, 0, "");
        setElement(term2628, 1, "");
        setField(term2627, term2627.getClass(), "keys", term2628);
        setField(term2627, term2627.getClass(), "vals", null);
        term2616 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2618 = (Object[]) newArray("java.lang.String", 490);
        setIntField(term2616, term2616.getClass(), "size", 2);
        setElement(term2618, 0, "");
        setElement(term2618, 1, "");
        setField(term2616, term2616.getClass(), "keys", term2618);
        setField(term2616, term2616.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.ParseSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term2605;
        Object retValue = callMethod(klass, "normalizeAttributes", argTypes, term2547, args);
        assertTrue(recursiveEquals(term2547, term2626));
        assertTrue(recursiveEquals(term2605, term2627));
        assertTrue(recursiveEquals(retValue, term2616));
    }

};



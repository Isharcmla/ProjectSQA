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

public class ParseSettings_normalizeAttributes_58794925443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6939;
     Object term6997;
     Object term7076;
     Object term7077;
     Object term7060;

    public ParseSettings_normalizeAttributes_58794925443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6939 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term6939, term6939.getClass(), "preserveAttributeCase", false);
        term6997 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6771 = (Object[]) newArray("java.lang.String", 17);
        setIntField(term6997, term6997.getClass(), "size", 5);
        setElement(term6771, 2, "");
        setField(term6997, term6997.getClass(), "keys", term6771);
        term7076 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term7076, term7076.getClass(), "preserveTagCase", false);
        setBooleanField(term7076, term7076.getClass(), "preserveAttributeCase", false);
        term7077 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7078 = (Object[]) newArray("java.lang.String", 17);
        setIntField(term7077, term7077.getClass(), "size", 5);
        setElement(term7078, 0, "");
        setElement(term7078, 1, "");
        setElement(term7078, 2, "");
        setElement(term7078, 3, "");
        setElement(term7078, 4, "");
        setField(term7077, term7077.getClass(), "keys", term7078);
        setField(term7077, term7077.getClass(), "vals", null);
        term7060 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7062 = (Object[]) newArray("java.lang.String", 17);
        setIntField(term7060, term7060.getClass(), "size", 5);
        setElement(term7062, 0, "");
        setElement(term7062, 1, "");
        setElement(term7062, 2, "");
        setElement(term7062, 3, "");
        setElement(term7062, 4, "");
        setField(term7060, term7060.getClass(), "keys", term7062);
        setField(term7060, term7060.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.ParseSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term6997;
        Object retValue = callMethod(klass, "normalizeAttributes", argTypes, term6939, args);
        assertTrue(recursiveEquals(term6939, term7076));
        assertTrue(recursiveEquals(term6997, term7077));
        assertTrue(recursiveEquals(retValue, term7060));
    }

};



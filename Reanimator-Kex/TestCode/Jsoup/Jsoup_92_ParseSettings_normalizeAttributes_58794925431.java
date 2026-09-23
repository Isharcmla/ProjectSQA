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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ParseSettings_normalizeAttributes_58794925431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4878;
     Object term4936;

    public ParseSettings_normalizeAttributes_58794925431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4878 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term4878, term4878.getClass(), "preserveAttributeCase", false);
        term4936 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4796 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term4936, term4936.getClass(), "size", 1);
        setField(term4936, term4936.getClass(), "keys", term4796);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.ParseSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term4936;
        try {
            callMethod(klass, "normalizeAttributes", argTypes, term4878, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



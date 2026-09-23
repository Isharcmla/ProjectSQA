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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class HtmlTreeBuilder_inScope_28471792304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229171;

    public HtmlTreeBuilder_inScope_28471792304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term229223 = new ArrayList();
        term229171 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term229076 = (Object[]) newArray("java.lang.String", 233);
        setField(term229171, term229171.getClass(), "specificScopeTarget", term229076);
        setField(term229171, term229171.getClass(), "stack", term229223);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "inScope", argTypes, term229171, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



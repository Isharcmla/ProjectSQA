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
import java.lang.ClassCastException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class HtmlTreeBuilder_clearFormattingElementsToLastMarker_1336759180342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244425;

    public HtmlTreeBuilder_clearFormattingElementsToLastMarker_1336759180342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term244515 = newInstance(Class.forName("java.lang.Object"));
        Object[] term244310 = (Object[]) newArray("java.lang.Object", 0);
        ArrayList term244477 = new ArrayList();
        ((ArrayList) term244477).add(term244515);
        ((ArrayList) term244477).add((Object)term244310);
        term244425 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term244425, term244425.getClass(), "formattingElements", term244477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearFormattingElementsToLastMarker", argTypes, term244425, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};



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

public class HtmlTreeBuilder_clearFormattingElementsToLastMarker_1336759180366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term433066;

    public HtmlTreeBuilder_clearFormattingElementsToLastMarker_1336759180366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term433156 = newInstance(Class.forName("java.lang.Object"));
        Object[] term432951 = (Object[]) newArray("java.lang.Object", 0);
        ArrayList term433118 = new ArrayList();
        ((ArrayList) term433118).add(term433156);
        ((ArrayList) term433118).add((Object)term432951);
        term433066 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term433066, term433066.getClass(), "formattingElements", term433118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearFormattingElementsToLastMarker", argTypes, term433066, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};



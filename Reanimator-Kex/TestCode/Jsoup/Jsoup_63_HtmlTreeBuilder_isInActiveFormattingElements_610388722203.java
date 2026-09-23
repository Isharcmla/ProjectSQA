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

public class HtmlTreeBuilder_isInActiveFormattingElements_610388722203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211059;

    public HtmlTreeBuilder_isInActiveFormattingElements_610388722203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term211149 = newInstance(Class.forName("java.lang.Object"));
        Object term211203 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term211111 = new ArrayList();
        ((ArrayList) term211111).add(term211149);
        ((ArrayList) term211111).add(term211203);
        term211059 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term211059, term211059.getClass(), "formattingElements", term211111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isInActiveFormattingElements", argTypes, term211059, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};



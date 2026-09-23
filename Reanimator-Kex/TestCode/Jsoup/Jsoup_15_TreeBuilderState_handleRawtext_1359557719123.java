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

public class TreeBuilderState_handleRawtext_1359557719123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258008;
     Object term258166;

    public TreeBuilderState_handleRawtext_1359557719123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258008 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term258104 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term258008, term258008.getClass(), "selfClosing", true);
        setField(term258008, term258008.getClass(), "tagName", "          ");
        setField(term258008, term258008.getClass(), "attributes", term258104);
        term258166 = newInstance(Class.forName("org.jsoup.parser.TreeBuilder"));
        Object term258286 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term258166, term258166.getClass(), "baseUri", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        setField(term258166, term258166.getClass(), "stack", term258286);
        setBooleanField(term258166, term258166.getClass(), "fosterInserts", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.TreeBuilder");
        Object[] args = new Object[2];
        args[0] = term258008;
        args[1] = term258166;
        try {
            callMethod(klass, "handleRawtext", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



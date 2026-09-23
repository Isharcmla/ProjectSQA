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

public class TreeBuilderState_handleRawtext_135955771951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90649;
     Object term90807;

    public TreeBuilderState_handleRawtext_135955771951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90649 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term90745 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term90649, term90649.getClass(), "selfClosing", true);
        setField(term90649, term90649.getClass(), "tagName", "          ");
        setField(term90649, term90649.getClass(), "attributes", term90745);
        term90807 = newInstance(Class.forName("org.jsoup.parser.TreeBuilder"));
        Object term90927 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term90807, term90807.getClass(), "baseUri", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        setField(term90807, term90807.getClass(), "stack", term90927);
        setBooleanField(term90807, term90807.getClass(), "fosterInserts", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.TreeBuilder");
        Object[] args = new Object[2];
        args[0] = term90649;
        args[1] = term90807;
        try {
            callMethod(klass, "handleRawtext", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



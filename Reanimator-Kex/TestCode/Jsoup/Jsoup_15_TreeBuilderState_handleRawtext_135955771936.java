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

public class TreeBuilderState_handleRawtext_135955771936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66772;
     Object term66930;

    public TreeBuilderState_handleRawtext_135955771936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66772 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term66868 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term66772, term66772.getClass(), "selfClosing", true);
        setField(term66772, term66772.getClass(), "tagName", "          ");
        setField(term66772, term66772.getClass(), "attributes", term66868);
        term66930 = newInstance(Class.forName("org.jsoup.parser.TreeBuilder"));
        Object term67050 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term66930, term66930.getClass(), "baseUri", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        setField(term66930, term66930.getClass(), "stack", term67050);
        setBooleanField(term66930, term66930.getClass(), "fosterInserts", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.TreeBuilder");
        Object[] args = new Object[2];
        args[0] = term66772;
        args[1] = term66930;
        try {
            callMethod(klass, "handleRawtext", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



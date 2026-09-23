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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class XmlTreeBuilder_insertNode_215006970165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253071;
     Object term253255;

    public XmlTreeBuilder_insertNode_215006970165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term253195 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        ArrayList term253123 = new ArrayList();
        ((ArrayList) term253123).add((Object)null);
        ((ArrayList) term253123).add(term253195);
        term253071 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term253071, term253071.getClass(), "stack", term253123);
        term253255 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term253255;
        try {
            callMethod(klass, "insertNode", argTypes, term253071, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class XmlTreeBuilder_insertNode_215006970339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466494;
     Object term466672;

    public XmlTreeBuilder_insertNode_215006970339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term466600 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term466546 = new ArrayList();
        ((ArrayList) term466546).add((Object)null);
        ((ArrayList) term466546).add(term466600);
        term466494 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term466494, term466494.getClass(), "stack", term466546);
        term466672 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term466672;
        try {
            callMethod(klass, "insertNode", argTypes, term466494, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



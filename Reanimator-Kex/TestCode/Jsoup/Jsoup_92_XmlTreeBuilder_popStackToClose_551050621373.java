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
import java.lang.Object;
import java.util.ArrayList;

public class XmlTreeBuilder_popStackToClose_551050621373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351023;
     Object term351399;

    public XmlTreeBuilder_popStackToClose_551050621373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term351179 = newInstance(Class.forName("java.lang.Object"));
        Object term351217 = newInstance(Class.forName("java.lang.Object"));
        Object term351289 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        Object term351335 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term351289, term351289.getClass(), "tag", term351335);
        ArrayList term351141 = new ArrayList();
        ((ArrayList) term351141).add(term351179);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add(term351217);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add((Object)null);
        ((ArrayList) term351141).add(term351289);
        term351023 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term351089 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term351089, term351089.getClass(), "preserveTagCase", false);
        setField(term351023, term351023.getClass(), "settings", term351089);
        setField(term351023, term351023.getClass(), "stack", term351141);
        term351399 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term351399, term351399.getClass(), "tagName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term351399;
        try {
            callMethod(klass, "popStackToClose", argTypes, term351023, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



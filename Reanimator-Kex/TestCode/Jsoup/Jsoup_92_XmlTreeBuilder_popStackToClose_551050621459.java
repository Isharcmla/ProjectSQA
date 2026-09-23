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

public class XmlTreeBuilder_popStackToClose_551050621459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384358;
     Object term384712;

    public XmlTreeBuilder_popStackToClose_551050621459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term384548 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        Object term384594 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term384548, term384548.getClass(), "tag", term384594);
        Object term384648 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term384476 = new ArrayList();
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add((Object)null);
        ((ArrayList) term384476).add(term384548);
        ((ArrayList) term384476).add(term384648);
        term384358 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term384424 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term384424, term384424.getClass(), "preserveTagCase", false);
        setField(term384358, term384358.getClass(), "settings", term384424);
        setField(term384358, term384358.getClass(), "stack", term384476);
        term384712 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term384712, term384712.getClass(), "tagName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term384712;
        try {
            callMethod(klass, "popStackToClose", argTypes, term384358, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



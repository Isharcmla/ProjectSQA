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
import java.lang.Object;
import java.util.ArrayList;

public class XmlTreeBuilder_popStackToClose_551050621157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249730;
     Object term250086;

    public XmlTreeBuilder_popStackToClose_551050621157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term249914 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        Object term249968 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term250022 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term249848 = new ArrayList();
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add((Object)null);
        ((ArrayList) term249848).add(term249914);
        ((ArrayList) term249848).add(term249968);
        ((ArrayList) term249848).add(term250022);
        term249730 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term249796 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term249796, term249796.getClass(), "preserveTagCase", false);
        setField(term249730, term249730.getClass(), "settings", term249796);
        setField(term249730, term249730.getClass(), "stack", term249848);
        term250086 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term250086, term250086.getClass(), "tagName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term250086;
        try {
            callMethod(klass, "popStackToClose", argTypes, term249730, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};



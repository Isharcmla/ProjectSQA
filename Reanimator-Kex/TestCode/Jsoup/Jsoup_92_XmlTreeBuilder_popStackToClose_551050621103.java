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

public class XmlTreeBuilder_popStackToClose_551050621103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221753;
     Object term221989;

    public XmlTreeBuilder_popStackToClose_551050621103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        byte[] term221572 = (byte[]) newByteArray(0);
        Object term221925 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term221871 = new ArrayList();
        ((ArrayList) term221871).add((Object)null);
        ((ArrayList) term221871).add((Object)null);
        ((ArrayList) term221871).add((Object)null);
        ((ArrayList) term221871).add((Object)null);
        ((ArrayList) term221871).add((Object)null);
        ((ArrayList) term221871).add((Object)null);
        ((ArrayList) term221871).add(term221572);
        ((ArrayList) term221871).add(term221925);
        term221753 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term221819 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term221819, term221819.getClass(), "preserveTagCase", false);
        setField(term221753, term221753.getClass(), "settings", term221819);
        setField(term221753, term221753.getClass(), "stack", term221871);
        term221989 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term221989, term221989.getClass(), "tagName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term221989;
        try {
            callMethod(klass, "popStackToClose", argTypes, term221753, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};



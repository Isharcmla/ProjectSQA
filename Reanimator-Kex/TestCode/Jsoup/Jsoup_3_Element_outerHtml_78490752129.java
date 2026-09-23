package org.jsoup.nodes;

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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_outerHtml_78490752129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6881;
     Object term6973;

    public Element_outerHtml_78490752129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6903 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6903, term6903.getClass(), "tagName", null);
        setBooleanField(term6903, term6903.getClass(), "isBlock", true);
        setBooleanField(term6903, term6903.getClass(), "canContainBlock", false);
        setBooleanField(term6903, term6903.getClass(), "canContainInline", false);
        setBooleanField(term6903, term6903.getClass(), "optionalClosing", false);
        setBooleanField(term6903, term6903.getClass(), "empty", true);
        setBooleanField(term6903, term6903.getClass(), "preserveWhitespace", true);
        setField(term6903, term6903.getClass(), "ancestors", null);
        Object term6910 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6910, term6910.getClass(), "tagName", null);
        setBooleanField(term6910, term6910.getClass(), "isBlock", true);
        setBooleanField(term6910, term6910.getClass(), "canContainBlock", false);
        setBooleanField(term6910, term6910.getClass(), "canContainInline", true);
        setBooleanField(term6910, term6910.getClass(), "optionalClosing", true);
        setBooleanField(term6910, term6910.getClass(), "empty", true);
        setBooleanField(term6910, term6910.getClass(), "preserveWhitespace", false);
        setField(term6910, term6910.getClass(), "ancestors", null);
        Object term6917 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6917, term6917.getClass(), "tagName", null);
        setBooleanField(term6917, term6917.getClass(), "isBlock", false);
        setBooleanField(term6917, term6917.getClass(), "canContainBlock", false);
        setBooleanField(term6917, term6917.getClass(), "canContainInline", false);
        setBooleanField(term6917, term6917.getClass(), "optionalClosing", false);
        setBooleanField(term6917, term6917.getClass(), "empty", false);
        setBooleanField(term6917, term6917.getClass(), "preserveWhitespace", false);
        setField(term6917, term6917.getClass(), "ancestors", null);
        Object term6924 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6924, term6924.getClass(), "tagName", null);
        setBooleanField(term6924, term6924.getClass(), "isBlock", false);
        setBooleanField(term6924, term6924.getClass(), "canContainBlock", true);
        setBooleanField(term6924, term6924.getClass(), "canContainInline", true);
        setBooleanField(term6924, term6924.getClass(), "optionalClosing", false);
        setBooleanField(term6924, term6924.getClass(), "empty", false);
        setBooleanField(term6924, term6924.getClass(), "preserveWhitespace", false);
        setField(term6924, term6924.getClass(), "ancestors", null);
        ArrayList term6901 = new ArrayList();
        ((ArrayList) term6901).add(term6903);
        ((ArrayList) term6901).add(term6910);
        ((ArrayList) term6901).add(term6917);
        ((ArrayList) term6901).add(term6924);
        HashMap term6934 = new HashMap();
        Set<Object> term53336 =  ((Map) term6934).keySet();
        HashSet term6933 = new HashSet((Collection<? extends Object>) term53336);
        ArrayList term6950 = new ArrayList();
        ((ArrayList) term6950).add((Object)null);
        ((ArrayList) term6950).add((Object)null);
        ((ArrayList) term6950).add((Object)null);
        ((ArrayList) term6950).add((Object)null);
        ((ArrayList) term6950).add((Object)null);
        ((ArrayList) term6950).add((Object)null);
        ((ArrayList) term6950).add((Object)null);
        ((ArrayList) term6950).add((Object)null);
        ((ArrayList) term6950).add((Object)null);
        LinkedHashMap term6955 = new LinkedHashMap();
        term6881 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6882 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6954 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6882, term6882.getClass(), "tagName", "XuxkPrpfND");
        setBooleanField(term6882, term6882.getClass(), "isBlock", true);
        setBooleanField(term6882, term6882.getClass(), "canContainBlock", true);
        setBooleanField(term6882, term6882.getClass(), "canContainInline", true);
        setBooleanField(term6882, term6882.getClass(), "optionalClosing", false);
        setBooleanField(term6882, term6882.getClass(), "empty", false);
        setBooleanField(term6882, term6882.getClass(), "preserveWhitespace", true);
        setField(term6882, term6882.getClass(), "ancestors", term6901);
        setField(term6881, term6881.getClass(), "tag", term6882);
        setField(term6881, term6881.getClass(), "classNames", term6933);
        setField(term6881, term6881.getClass(), "parentNode", null);
        setField(term6881, term6881.getClass(), "childNodes", term6950);
        setField(term6954, term6954.getClass(), "attributes", term6955);
        setField(term6881, term6881.getClass(), "attributes", term6954);
        setField(term6881, term6881.getClass(), "baseUri", "XmLHcnVsch");
        term6973 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6974 = (byte[]) newByteArray(16);
        setField(term6973, term6973.getClass(), "value", term6974);
        setByteField(term6973, term6973.getClass(), "coder", (byte) 48);
        setIntField(term6973, term6973.getClass(), "count", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = term6973;
        try {
            callMethod(klass, "outerHtml", argTypes, term6881, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};



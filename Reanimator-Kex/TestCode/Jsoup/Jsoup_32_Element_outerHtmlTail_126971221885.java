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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.lang.Integer;

public class Element_outerHtmlTail_126971221885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8361;
     Object term8428;
     Object term8448;
     Object term8450;

    public Element_outerHtmlTail_126971221885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8383 = new HashMap();
        Set<Object> term8463 =  ((Map) term8383).keySet();
        HashSet term8382 = new HashSet((Collection<? extends Object>) term8463);
        ArrayList term8399 = new ArrayList();
        ((ArrayList) term8399).add((Object)null);
        ((ArrayList) term8399).add((Object)null);
        ((ArrayList) term8399).add((Object)null);
        ((ArrayList) term8399).add((Object)null);
        ((ArrayList) term8399).add((Object)null);
        LinkedHashMap term8404 = new LinkedHashMap();
        term8361 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8362 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8403 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8362, term8362.getClass(), "tagName", "oYymmLqbfJ");
        setBooleanField(term8362, term8362.getClass(), "isBlock", false);
        setBooleanField(term8362, term8362.getClass(), "formatAsBlock", true);
        setBooleanField(term8362, term8362.getClass(), "canContainBlock", false);
        setBooleanField(term8362, term8362.getClass(), "canContainInline", false);
        setBooleanField(term8362, term8362.getClass(), "empty", true);
        setBooleanField(term8362, term8362.getClass(), "selfClosing", false);
        setBooleanField(term8362, term8362.getClass(), "preserveWhitespace", false);
        setField(term8361, term8361.getClass(), "tag", term8362);
        setField(term8361, term8361.getClass(), "classNames", term8382);
        setField(term8361, term8361.getClass(), "parentNode", null);
        setField(term8361, term8361.getClass(), "childNodes", term8399);
        setField(term8403, term8403.getClass(), "attributes", term8404);
        setField(term8361, term8361.getClass(), "attributes", term8403);
        setField(term8361, term8361.getClass(), "baseUri", "cxRwRcodud");
        setIntField(term8361, term8361.getClass(), "siblingIndex", 1557431527);
        term8428 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8429 = (byte[]) newByteArray(16);
        setField(term8428, term8428.getClass(), "value", term8429);
        setByteField(term8428, term8428.getClass(), "coder", (byte) -58);
        setIntField(term8428, term8428.getClass(), "count", -1504890659);
        term8448 = new Integer(1358829571);
        term8450 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term8450, term8450.getClass(), "escapeMode", null);
        setField(term8450, term8450.getClass(), "charset", null);
        setField(term8450, term8450.getClass(), "charsetEncoder", null);
        setBooleanField(term8450, term8450.getClass(), "prettyPrint", false);
        setIntField(term8450, term8450.getClass(), "indentAmount", 991356662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term8428;
        args[1] = term8448;
        args[2] = term8450;
        callMethod(klass, "outerHtmlTail", argTypes, term8361, args);
    }

};



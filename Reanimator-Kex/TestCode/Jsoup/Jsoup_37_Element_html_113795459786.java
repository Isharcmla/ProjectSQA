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

public class Element_html_113795459786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8444;
     Object term8511;

    public Element_html_113795459786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8468 = new HashMap();
        Set<Object> term8541 =  ((Map) term8468).keySet();
        HashSet term8467 = new HashSet((Collection<? extends Object>) term8541);
        ArrayList term8482 = new ArrayList();
        ((ArrayList) term8482).add((Object)null);
        ((ArrayList) term8482).add((Object)null);
        ((ArrayList) term8482).add((Object)null);
        ((ArrayList) term8482).add((Object)null);
        ((ArrayList) term8482).add((Object)null);
        ((ArrayList) term8482).add((Object)null);
        ((ArrayList) term8482).add((Object)null);
        ((ArrayList) term8482).add((Object)null);
        LinkedHashMap term8487 = new LinkedHashMap();
        term8444 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8445 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8486 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8445, term8445.getClass(), "tagName", "iMsqJaKlDC");
        setBooleanField(term8445, term8445.getClass(), "isBlock", true);
        setBooleanField(term8445, term8445.getClass(), "formatAsBlock", true);
        setBooleanField(term8445, term8445.getClass(), "canContainBlock", true);
        setBooleanField(term8445, term8445.getClass(), "canContainInline", true);
        setBooleanField(term8445, term8445.getClass(), "empty", false);
        setBooleanField(term8445, term8445.getClass(), "selfClosing", false);
        setBooleanField(term8445, term8445.getClass(), "preserveWhitespace", false);
        setBooleanField(term8445, term8445.getClass(), "formList", true);
        setBooleanField(term8445, term8445.getClass(), "formSubmit", true);
        setField(term8444, term8444.getClass(), "tag", term8445);
        setField(term8444, term8444.getClass(), "classNames", term8467);
        setField(term8444, term8444.getClass(), "parentNode", null);
        setField(term8444, term8444.getClass(), "childNodes", term8482);
        setField(term8486, term8486.getClass(), "attributes", term8487);
        setField(term8444, term8444.getClass(), "attributes", term8486);
        setField(term8444, term8444.getClass(), "baseUri", "nnnmCgFBLw");
        setIntField(term8444, term8444.getClass(), "siblingIndex", -1504890659);
        term8511 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8512 = (byte[]) newByteArray(16);
        setField(term8511, term8511.getClass(), "value", term8512);
        setByteField(term8511, term8511.getClass(), "coder", (byte) -58);
        setIntField(term8511, term8511.getClass(), "count", 1358829571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = term8511;
        callMethod(klass, "html", argTypes, term8444, args);
    }

};



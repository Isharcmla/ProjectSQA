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

public class Element_html_113795459787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8578;
     Object term8634;

    public Element_html_113795459787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8600 = new HashMap();
        Set<Object> term8664 =  ((Map) term8600).keySet();
        HashSet term8599 = new HashSet((Collection<? extends Object>) term8664);
        ArrayList term8605 = new ArrayList();
        ((ArrayList) term8605).add((Object)null);
        ((ArrayList) term8605).add((Object)null);
        ((ArrayList) term8605).add((Object)null);
        ((ArrayList) term8605).add((Object)null);
        ((ArrayList) term8605).add((Object)null);
        ((ArrayList) term8605).add((Object)null);
        ((ArrayList) term8605).add((Object)null);
        LinkedHashMap term8610 = new LinkedHashMap();
        term8578 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8579 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8609 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8579, term8579.getClass(), "tagName", "bkSgsDrkCN");
        setBooleanField(term8579, term8579.getClass(), "isBlock", true);
        setBooleanField(term8579, term8579.getClass(), "formatAsBlock", false);
        setBooleanField(term8579, term8579.getClass(), "canContainBlock", false);
        setBooleanField(term8579, term8579.getClass(), "canContainInline", false);
        setBooleanField(term8579, term8579.getClass(), "empty", false);
        setBooleanField(term8579, term8579.getClass(), "selfClosing", false);
        setBooleanField(term8579, term8579.getClass(), "preserveWhitespace", false);
        setField(term8578, term8578.getClass(), "tag", term8579);
        setField(term8578, term8578.getClass(), "classNames", term8599);
        setField(term8578, term8578.getClass(), "parentNode", null);
        setField(term8578, term8578.getClass(), "childNodes", term8605);
        setField(term8609, term8609.getClass(), "attributes", term8610);
        setField(term8578, term8578.getClass(), "attributes", term8609);
        setField(term8578, term8578.getClass(), "baseUri", "gZPZNkweEp");
        setIntField(term8578, term8578.getClass(), "siblingIndex", -507387516);
        term8634 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8635 = (byte[]) newByteArray(16);
        setField(term8634, term8634.getClass(), "value", term8635);
        setByteField(term8634, term8634.getClass(), "coder", (byte) -29);
        setIntField(term8634, term8634.getClass(), "count", -1970452551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = term8634;
        callMethod(klass, "html", argTypes, term8578, args);
    }

};



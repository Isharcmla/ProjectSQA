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

public class Element_ownText_186502842967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6612;
     Object term6675;

    public Element_ownText_186502842967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6634 = new HashMap();
        Set<Object> term6705 =  ((Map) term6634).keySet();
        HashSet term6633 = new HashSet((Collection<? extends Object>) term6705);
        ArrayList term6646 = new ArrayList();
        ((ArrayList) term6646).add((Object)null);
        ((ArrayList) term6646).add((Object)null);
        ((ArrayList) term6646).add((Object)null);
        ((ArrayList) term6646).add((Object)null);
        LinkedHashMap term6651 = new LinkedHashMap();
        term6612 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6613 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6650 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6613, term6613.getClass(), "tagName", "yIWXcOQTgy");
        setBooleanField(term6613, term6613.getClass(), "isBlock", true);
        setBooleanField(term6613, term6613.getClass(), "formatAsBlock", false);
        setBooleanField(term6613, term6613.getClass(), "canContainBlock", false);
        setBooleanField(term6613, term6613.getClass(), "canContainInline", true);
        setBooleanField(term6613, term6613.getClass(), "empty", true);
        setBooleanField(term6613, term6613.getClass(), "selfClosing", false);
        setBooleanField(term6613, term6613.getClass(), "preserveWhitespace", true);
        setField(term6612, term6612.getClass(), "tag", term6613);
        setField(term6612, term6612.getClass(), "classNames", term6633);
        setField(term6612, term6612.getClass(), "parentNode", null);
        setField(term6612, term6612.getClass(), "childNodes", term6646);
        setField(term6650, term6650.getClass(), "attributes", term6651);
        setField(term6612, term6612.getClass(), "attributes", term6650);
        setField(term6612, term6612.getClass(), "baseUri", "TGiJfagfky");
        setIntField(term6612, term6612.getClass(), "siblingIndex", 1598895173);
        term6675 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6676 = (byte[]) newByteArray(16);
        setField(term6675, term6675.getClass(), "value", term6676);
        setByteField(term6675, term6675.getClass(), "coder", (byte) 48);
        setIntField(term6675, term6675.getClass(), "count", 1830648570);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = term6675;
        callMethod(klass, "ownText", argTypes, term6612, args);
    }

};



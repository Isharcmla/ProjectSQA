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

public class Element_val_205212752382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8184;

    public Element_val_205212752382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8206 = new HashMap();
        Set<Object> term8267 =  ((Map) term8206).keySet();
        HashSet term8205 = new HashSet((Collection<? extends Object>) term8267);
        ArrayList term8216 = new ArrayList();
        ((ArrayList) term8216).add((Object)null);
        ((ArrayList) term8216).add((Object)null);
        ((ArrayList) term8216).add((Object)null);
        ((ArrayList) term8216).add((Object)null);
        LinkedHashMap term8221 = new LinkedHashMap();
        term8184 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8185 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8220 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8185, term8185.getClass(), "tagName", "xweqkPdyJH");
        setBooleanField(term8185, term8185.getClass(), "isBlock", true);
        setBooleanField(term8185, term8185.getClass(), "formatAsBlock", true);
        setBooleanField(term8185, term8185.getClass(), "canContainBlock", true);
        setBooleanField(term8185, term8185.getClass(), "canContainInline", true);
        setBooleanField(term8185, term8185.getClass(), "empty", false);
        setBooleanField(term8185, term8185.getClass(), "selfClosing", false);
        setBooleanField(term8185, term8185.getClass(), "preserveWhitespace", false);
        setField(term8184, term8184.getClass(), "tag", term8185);
        setField(term8184, term8184.getClass(), "classNames", term8205);
        setField(term8184, term8184.getClass(), "parentNode", null);
        setField(term8184, term8184.getClass(), "childNodes", term8216);
        setField(term8220, term8220.getClass(), "attributes", term8221);
        setField(term8184, term8184.getClass(), "attributes", term8220);
        setField(term8184, term8184.getClass(), "baseUri", "zSMVllDpfk");
        setIntField(term8184, term8184.getClass(), "siblingIndex", 663292551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iptRXVDoYE";
        callMethod(klass, "val", argTypes, term8184, args);
    }

};



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

public class Element_val_205212752383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8132;

    public Element_val_205212752383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8154 = new HashMap();
        Set<Object> term8215 =  ((Map) term8154).keySet();
        HashSet term8153 = new HashSet((Collection<? extends Object>) term8215);
        ArrayList term8164 = new ArrayList();
        ((ArrayList) term8164).add((Object)null);
        ((ArrayList) term8164).add((Object)null);
        ((ArrayList) term8164).add((Object)null);
        ((ArrayList) term8164).add((Object)null);
        LinkedHashMap term8169 = new LinkedHashMap();
        term8132 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8133 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8168 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8133, term8133.getClass(), "tagName", "xweqkPdyJH");
        setBooleanField(term8133, term8133.getClass(), "isBlock", true);
        setBooleanField(term8133, term8133.getClass(), "formatAsBlock", true);
        setBooleanField(term8133, term8133.getClass(), "canContainBlock", true);
        setBooleanField(term8133, term8133.getClass(), "canContainInline", true);
        setBooleanField(term8133, term8133.getClass(), "empty", false);
        setBooleanField(term8133, term8133.getClass(), "selfClosing", false);
        setBooleanField(term8133, term8133.getClass(), "preserveWhitespace", false);
        setField(term8132, term8132.getClass(), "tag", term8133);
        setField(term8132, term8132.getClass(), "classNames", term8153);
        setField(term8132, term8132.getClass(), "parentNode", null);
        setField(term8132, term8132.getClass(), "childNodes", term8164);
        setField(term8168, term8168.getClass(), "attributes", term8169);
        setField(term8132, term8132.getClass(), "attributes", term8168);
        setField(term8132, term8132.getClass(), "baseUri", "zSMVllDpfk");
        setIntField(term8132, term8132.getClass(), "siblingIndex", -1885090354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iptRXVDoYE";
        callMethod(klass, "val", argTypes, term8132, args);
    }

};



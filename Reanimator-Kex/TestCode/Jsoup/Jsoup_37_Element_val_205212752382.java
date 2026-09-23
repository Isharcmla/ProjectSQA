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
     Object term7990;

    public Element_val_205212752382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8014 = new HashMap();
        Set<Object> term8083 =  ((Map) term8014).keySet();
        HashSet term8013 = new HashSet((Collection<? extends Object>) term8083);
        ArrayList term8032 = new ArrayList();
        ((ArrayList) term8032).add((Object)null);
        LinkedHashMap term8037 = new LinkedHashMap();
        term7990 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7991 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8036 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7991, term7991.getClass(), "tagName", "rfqJDkDppz");
        setBooleanField(term7991, term7991.getClass(), "isBlock", false);
        setBooleanField(term7991, term7991.getClass(), "formatAsBlock", false);
        setBooleanField(term7991, term7991.getClass(), "canContainBlock", true);
        setBooleanField(term7991, term7991.getClass(), "canContainInline", false);
        setBooleanField(term7991, term7991.getClass(), "empty", false);
        setBooleanField(term7991, term7991.getClass(), "selfClosing", true);
        setBooleanField(term7991, term7991.getClass(), "preserveWhitespace", true);
        setBooleanField(term7991, term7991.getClass(), "formList", false);
        setBooleanField(term7991, term7991.getClass(), "formSubmit", true);
        setField(term7990, term7990.getClass(), "tag", term7991);
        setField(term7990, term7990.getClass(), "classNames", term8013);
        setField(term7990, term7990.getClass(), "parentNode", null);
        setField(term7990, term7990.getClass(), "childNodes", term8032);
        setField(term8036, term8036.getClass(), "attributes", term8037);
        setField(term7990, term7990.getClass(), "attributes", term8036);
        setField(term7990, term7990.getClass(), "baseUri", "HqitWglYWX");
        setIntField(term7990, term7990.getClass(), "siblingIndex", -1274456137);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pOuFRlHmbK";
        callMethod(klass, "val", argTypes, term7990, args);
    }

};



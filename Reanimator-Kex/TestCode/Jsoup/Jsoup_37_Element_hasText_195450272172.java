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

public class Element_hasText_195450272172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7014;

    public Element_hasText_195450272172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7038 = new HashMap();
        Set<Object> term7095 =  ((Map) term7038).keySet();
        HashSet term7037 = new HashSet((Collection<? extends Object>) term7095);
        ArrayList term7056 = new ArrayList();
        ((ArrayList) term7056).add((Object)null);
        ((ArrayList) term7056).add((Object)null);
        ((ArrayList) term7056).add((Object)null);
        ((ArrayList) term7056).add((Object)null);
        ((ArrayList) term7056).add((Object)null);
        ((ArrayList) term7056).add((Object)null);
        ((ArrayList) term7056).add((Object)null);
        LinkedHashMap term7061 = new LinkedHashMap();
        term7014 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7015 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7060 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7015, term7015.getClass(), "tagName", "DbfiyFeaTe");
        setBooleanField(term7015, term7015.getClass(), "isBlock", true);
        setBooleanField(term7015, term7015.getClass(), "formatAsBlock", true);
        setBooleanField(term7015, term7015.getClass(), "canContainBlock", true);
        setBooleanField(term7015, term7015.getClass(), "canContainInline", true);
        setBooleanField(term7015, term7015.getClass(), "empty", true);
        setBooleanField(term7015, term7015.getClass(), "selfClosing", false);
        setBooleanField(term7015, term7015.getClass(), "preserveWhitespace", true);
        setBooleanField(term7015, term7015.getClass(), "formList", false);
        setBooleanField(term7015, term7015.getClass(), "formSubmit", true);
        setField(term7014, term7014.getClass(), "tag", term7015);
        setField(term7014, term7014.getClass(), "classNames", term7037);
        setField(term7014, term7014.getClass(), "parentNode", null);
        setField(term7014, term7014.getClass(), "childNodes", term7056);
        setField(term7060, term7060.getClass(), "attributes", term7061);
        setField(term7014, term7014.getClass(), "attributes", term7060);
        setField(term7014, term7014.getClass(), "baseUri", "ANHjlWPmZG");
        setIntField(term7014, term7014.getClass(), "siblingIndex", -523949691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasText", argTypes, term7014, args);
    }

};



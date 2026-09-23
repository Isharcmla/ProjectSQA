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

public class Element_getElementsByIndexLessThan_75155669352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5102;
     Object term5167;

    public Element_getElementsByIndexLessThan_75155669352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5124 = new HashMap();
        Set<Object> term5179 =  ((Map) term5124).keySet();
        HashSet term5123 = new HashSet((Collection<? extends Object>) term5179);
        ArrayList term5138 = new ArrayList();
        ((ArrayList) term5138).add((Object)null);
        ((ArrayList) term5138).add((Object)null);
        ((ArrayList) term5138).add((Object)null);
        ((ArrayList) term5138).add((Object)null);
        ((ArrayList) term5138).add((Object)null);
        ((ArrayList) term5138).add((Object)null);
        LinkedHashMap term5143 = new LinkedHashMap();
        term5102 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5103 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5142 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5103, term5103.getClass(), "tagName", "CAMnvfDLJL");
        setBooleanField(term5103, term5103.getClass(), "isBlock", false);
        setBooleanField(term5103, term5103.getClass(), "formatAsBlock", true);
        setBooleanField(term5103, term5103.getClass(), "canContainBlock", false);
        setBooleanField(term5103, term5103.getClass(), "canContainInline", true);
        setBooleanField(term5103, term5103.getClass(), "empty", false);
        setBooleanField(term5103, term5103.getClass(), "selfClosing", false);
        setBooleanField(term5103, term5103.getClass(), "preserveWhitespace", true);
        setField(term5102, term5102.getClass(), "tag", term5103);
        setField(term5102, term5102.getClass(), "classNames", term5123);
        setField(term5102, term5102.getClass(), "parentNode", null);
        setField(term5102, term5102.getClass(), "childNodes", term5138);
        setField(term5142, term5142.getClass(), "attributes", term5143);
        setField(term5102, term5102.getClass(), "attributes", term5142);
        setField(term5102, term5102.getClass(), "baseUri", "bHHjfDCntT");
        setIntField(term5102, term5102.getClass(), "siblingIndex", 1265463001);
        term5167 = new Integer(335112684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5167;
        callMethod(klass, "getElementsByIndexLessThan", argTypes, term5102, args);
    }

};



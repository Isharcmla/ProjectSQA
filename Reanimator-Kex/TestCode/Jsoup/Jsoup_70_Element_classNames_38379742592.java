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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Element_classNames_38379742592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7038;
     Object term7085;

    public Element_classNames_38379742592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7064 = new ArrayList();
        ((ArrayList) term7064).add((Object)null);
        ((ArrayList) term7064).add((Object)null);
        ((ArrayList) term7064).add((Object)null);
        ((ArrayList) term7064).add((Object)null);
        term7038 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7039 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7060 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term7061 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term7062 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term7068 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7070 = (Object[]) newArray("java.lang.String", 0);
        Object[] term7071 = (Object[]) newArray("java.lang.String", 0);
        setField(term7039, term7039.getClass(), "tagName", "NzBMMhkhpT");
        setBooleanField(term7039, term7039.getClass(), "isBlock", false);
        setBooleanField(term7039, term7039.getClass(), "formatAsBlock", false);
        setBooleanField(term7039, term7039.getClass(), "canContainInline", false);
        setBooleanField(term7039, term7039.getClass(), "empty", false);
        setBooleanField(term7039, term7039.getClass(), "selfClosing", false);
        setBooleanField(term7039, term7039.getClass(), "preserveWhitespace", true);
        setBooleanField(term7039, term7039.getClass(), "formList", false);
        setBooleanField(term7039, term7039.getClass(), "formSubmit", false);
        setField(term7038, term7038.getClass(), "tag", term7039);
        setField(term7060, term7060.getClass(), "referent", null);
        setField(term7061, term7061.getClass(), "lock", term7062);
        setField(term7061, term7061.getClass(), "head", null);
        setLongField(term7061, term7061.getClass(), "queueLength", 2701184207686293431L);
        setField(term7060, term7060.getClass(), "queue", term7061);
        setField(term7060, term7060.getClass(), "next", null);
        setField(term7060, term7060.getClass(), "discovered", null);
        setField(term7038, term7038.getClass(), "shadowChildrenRef", term7060);
        setField(term7038, term7038.getClass(), "childNodes", term7064);
        setIntField(term7068, term7068.getClass(), "size", 534834644);
        setField(term7068, term7068.getClass(), "keys", term7070);
        setField(term7068, term7068.getClass(), "vals", term7071);
        setField(term7038, term7038.getClass(), "attributes", term7068);
        setField(term7038, term7038.getClass(), "baseUri", "qCpEbQDHdF");
        setField(term7038, term7038.getClass(), "parentNode", null);
        setIntField(term7038, term7038.getClass(), "siblingIndex", 1959097203);
        HashMap term7086 = new HashMap();
        Set<Object> term7111 =  ((Map) term7086).keySet();
        term7085 = new HashSet((Collection<? extends Object>) term7111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term7085;
        callMethod(klass, "classNames", argTypes, term7038, args);
    }

};



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

public class Element_html_923814631104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55347;

    public Element_html_923814631104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55373 = new ArrayList();
        ((ArrayList) term55373).add((Object)null);
        ((ArrayList) term55373).add((Object)null);
        ((ArrayList) term55373).add((Object)null);
        ((ArrayList) term55373).add((Object)null);
        ((ArrayList) term55373).add((Object)null);
        term55347 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term55348 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term55369 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term55370 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term55371 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term55377 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term55379 = (Object[]) newArray("java.lang.String", 0);
        Object[] term55380 = (Object[]) newArray("java.lang.String", 0);
        setField(term55348, term55348.getClass(), "tagName", "UBRmXJmfrt");
        setBooleanField(term55348, term55348.getClass(), "isBlock", true);
        setBooleanField(term55348, term55348.getClass(), "formatAsBlock", true);
        setBooleanField(term55348, term55348.getClass(), "canContainInline", false);
        setBooleanField(term55348, term55348.getClass(), "empty", true);
        setBooleanField(term55348, term55348.getClass(), "selfClosing", false);
        setBooleanField(term55348, term55348.getClass(), "preserveWhitespace", true);
        setBooleanField(term55348, term55348.getClass(), "formList", true);
        setBooleanField(term55348, term55348.getClass(), "formSubmit", false);
        setField(term55347, term55347.getClass(), "tag", term55348);
        setField(term55369, term55369.getClass(), "referent", null);
        setField(term55370, term55370.getClass(), "lock", term55371);
        setField(term55370, term55370.getClass(), "head", null);
        setLongField(term55370, term55370.getClass(), "queueLength", -8085190702504231560L);
        setField(term55369, term55369.getClass(), "queue", term55370);
        setField(term55369, term55369.getClass(), "next", null);
        setField(term55369, term55369.getClass(), "discovered", null);
        setField(term55347, term55347.getClass(), "shadowChildrenRef", term55369);
        setField(term55347, term55347.getClass(), "childNodes", term55373);
        setIntField(term55377, term55377.getClass(), "size", -129547140);
        setField(term55377, term55377.getClass(), "keys", term55379);
        setField(term55377, term55377.getClass(), "vals", term55380);
        setField(term55347, term55347.getClass(), "attributes", term55377);
        setField(term55347, term55347.getClass(), "baseUri", "WZzvmIHhzZ");
        setField(term55347, term55347.getClass(), "parentNode", null);
        setIntField(term55347, term55347.getClass(), "siblingIndex", 199287428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "doQLHkjpNm";
        callMethod(klass, "html", argTypes, term55347, args);
    }

};



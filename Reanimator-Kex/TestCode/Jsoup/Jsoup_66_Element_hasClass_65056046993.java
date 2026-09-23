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

public class Element_hasClass_65056046993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7112;

    public Element_hasClass_65056046993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7138 = new ArrayList();
        ((ArrayList) term7138).add((Object)null);
        ((ArrayList) term7138).add((Object)null);
        ((ArrayList) term7138).add((Object)null);
        ((ArrayList) term7138).add((Object)null);
        term7112 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7113 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7134 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term7135 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term7136 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term7142 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7144 = (Object[]) newArray("java.lang.String", 0);
        Object[] term7145 = (Object[]) newArray("java.lang.String", 0);
        setField(term7113, term7113.getClass(), "tagName", "AHbZyFOmlo");
        setBooleanField(term7113, term7113.getClass(), "isBlock", false);
        setBooleanField(term7113, term7113.getClass(), "formatAsBlock", false);
        setBooleanField(term7113, term7113.getClass(), "canContainInline", false);
        setBooleanField(term7113, term7113.getClass(), "empty", true);
        setBooleanField(term7113, term7113.getClass(), "selfClosing", false);
        setBooleanField(term7113, term7113.getClass(), "preserveWhitespace", false);
        setBooleanField(term7113, term7113.getClass(), "formList", true);
        setBooleanField(term7113, term7113.getClass(), "formSubmit", false);
        setField(term7112, term7112.getClass(), "tag", term7113);
        setField(term7134, term7134.getClass(), "referent", null);
        setField(term7135, term7135.getClass(), "lock", term7136);
        setField(term7135, term7135.getClass(), "head", null);
        setLongField(term7135, term7135.getClass(), "queueLength", 4474998035090263139L);
        setField(term7134, term7134.getClass(), "queue", term7135);
        setField(term7134, term7134.getClass(), "next", null);
        setField(term7134, term7134.getClass(), "discovered", null);
        setField(term7112, term7112.getClass(), "shadowChildrenRef", term7134);
        setField(term7112, term7112.getClass(), "childNodes", term7138);
        setIntField(term7142, term7142.getClass(), "size", -209654048);
        setField(term7142, term7142.getClass(), "keys", term7144);
        setField(term7142, term7142.getClass(), "vals", term7145);
        setField(term7112, term7112.getClass(), "attributes", term7142);
        setField(term7112, term7112.getClass(), "baseUri", "TwfWVQGiIj");
        setField(term7112, term7112.getClass(), "parentNode", null);
        setIntField(term7112, term7112.getClass(), "siblingIndex", 477625804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gUvcueTURF";
        callMethod(klass, "hasClass", argTypes, term7112, args);
    }

};



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

public class Element_getElementsContainingOwnText_119974451276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5855;

    public Element_getElementsContainingOwnText_119974451276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5881 = new ArrayList();
        ((ArrayList) term5881).add((Object)null);
        term5855 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5856 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5877 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term5878 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term5879 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term5885 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5887 = (Object[]) newArray("java.lang.String", 0);
        Object[] term5888 = (Object[]) newArray("java.lang.String", 0);
        setField(term5856, term5856.getClass(), "tagName", "lFRJFUMVbx");
        setBooleanField(term5856, term5856.getClass(), "isBlock", true);
        setBooleanField(term5856, term5856.getClass(), "formatAsBlock", true);
        setBooleanField(term5856, term5856.getClass(), "canContainInline", true);
        setBooleanField(term5856, term5856.getClass(), "empty", true);
        setBooleanField(term5856, term5856.getClass(), "selfClosing", false);
        setBooleanField(term5856, term5856.getClass(), "preserveWhitespace", true);
        setBooleanField(term5856, term5856.getClass(), "formList", false);
        setBooleanField(term5856, term5856.getClass(), "formSubmit", true);
        setField(term5855, term5855.getClass(), "tag", term5856);
        setField(term5877, term5877.getClass(), "referent", null);
        setField(term5878, term5878.getClass(), "lock", term5879);
        setField(term5878, term5878.getClass(), "head", null);
        setLongField(term5878, term5878.getClass(), "queueLength", 6682528376118987775L);
        setField(term5877, term5877.getClass(), "queue", term5878);
        setField(term5877, term5877.getClass(), "next", null);
        setField(term5877, term5877.getClass(), "discovered", null);
        setField(term5855, term5855.getClass(), "shadowChildrenRef", term5877);
        setField(term5855, term5855.getClass(), "childNodes", term5881);
        setIntField(term5885, term5885.getClass(), "size", 389427431);
        setField(term5885, term5885.getClass(), "keys", term5887);
        setField(term5885, term5885.getClass(), "vals", term5888);
        setField(term5855, term5855.getClass(), "attributes", term5885);
        setField(term5855, term5855.getClass(), "baseUri", "sZdUNdggUW");
        setField(term5855, term5855.getClass(), "parentNode", null);
        setIntField(term5855, term5855.getClass(), "siblingIndex", -1945706126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OqbwYQfvAe";
        callMethod(klass, "getElementsContainingOwnText", argTypes, term5855, args);
    }

};



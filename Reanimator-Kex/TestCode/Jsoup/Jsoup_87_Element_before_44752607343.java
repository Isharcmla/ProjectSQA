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

public class Element_before_44752607343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3089;

    public Element_before_44752607343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3115 = new ArrayList();
        ((ArrayList) term3115).add((Object)null);
        ((ArrayList) term3115).add((Object)null);
        ((ArrayList) term3115).add((Object)null);
        ((ArrayList) term3115).add((Object)null);
        ((ArrayList) term3115).add((Object)null);
        ((ArrayList) term3115).add((Object)null);
        term3089 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3090 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3111 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term3112 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3113 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term3119 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3121 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3122 = (Object[]) newArray("java.lang.String", 0);
        setField(term3090, term3090.getClass(), "tagName", "AWRooQKkdW");
        setBooleanField(term3090, term3090.getClass(), "isBlock", true);
        setBooleanField(term3090, term3090.getClass(), "formatAsBlock", true);
        setBooleanField(term3090, term3090.getClass(), "canContainInline", false);
        setBooleanField(term3090, term3090.getClass(), "empty", false);
        setBooleanField(term3090, term3090.getClass(), "selfClosing", false);
        setBooleanField(term3090, term3090.getClass(), "preserveWhitespace", false);
        setBooleanField(term3090, term3090.getClass(), "formList", true);
        setBooleanField(term3090, term3090.getClass(), "formSubmit", true);
        setField(term3089, term3089.getClass(), "tag", term3090);
        setField(term3111, term3111.getClass(), "referent", null);
        setField(term3112, term3112.getClass(), "lock", term3113);
        setField(term3112, term3112.getClass(), "head", null);
        setLongField(term3112, term3112.getClass(), "queueLength", -2068172595987555756L);
        setField(term3111, term3111.getClass(), "queue", term3112);
        setField(term3111, term3111.getClass(), "next", null);
        setField(term3111, term3111.getClass(), "discovered", null);
        setField(term3089, term3089.getClass(), "shadowChildrenRef", term3111);
        setField(term3089, term3089.getClass(), "childNodes", term3115);
        setIntField(term3119, term3119.getClass(), "size", -1547384488);
        setField(term3119, term3119.getClass(), "keys", term3121);
        setField(term3119, term3119.getClass(), "vals", term3122);
        setField(term3089, term3089.getClass(), "attributes", term3119);
        setField(term3089, term3089.getClass(), "baseUri", "vjxIhXHxGR");
        setField(term3089, term3089.getClass(), "parentNode", null);
        setIntField(term3089, term3089.getClass(), "siblingIndex", 1442160736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "before", argTypes, term3089, args);
    }

};



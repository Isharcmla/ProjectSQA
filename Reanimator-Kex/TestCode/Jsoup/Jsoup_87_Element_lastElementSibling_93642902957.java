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

public class Element_lastElementSibling_93642902957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4073;

    public Element_lastElementSibling_93642902957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4099 = new ArrayList();
        ((ArrayList) term4099).add((Object)null);
        ((ArrayList) term4099).add((Object)null);
        ((ArrayList) term4099).add((Object)null);
        ((ArrayList) term4099).add((Object)null);
        ((ArrayList) term4099).add((Object)null);
        ((ArrayList) term4099).add((Object)null);
        ((ArrayList) term4099).add((Object)null);
        term4073 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4074 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4095 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term4096 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4097 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term4103 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4105 = (Object[]) newArray("java.lang.String", 0);
        Object[] term4106 = (Object[]) newArray("java.lang.String", 0);
        setField(term4074, term4074.getClass(), "tagName", "xJgPlLxpgC");
        setBooleanField(term4074, term4074.getClass(), "isBlock", false);
        setBooleanField(term4074, term4074.getClass(), "formatAsBlock", false);
        setBooleanField(term4074, term4074.getClass(), "canContainInline", true);
        setBooleanField(term4074, term4074.getClass(), "empty", true);
        setBooleanField(term4074, term4074.getClass(), "selfClosing", false);
        setBooleanField(term4074, term4074.getClass(), "preserveWhitespace", true);
        setBooleanField(term4074, term4074.getClass(), "formList", false);
        setBooleanField(term4074, term4074.getClass(), "formSubmit", true);
        setField(term4073, term4073.getClass(), "tag", term4074);
        setField(term4095, term4095.getClass(), "referent", null);
        setField(term4096, term4096.getClass(), "lock", term4097);
        setField(term4096, term4096.getClass(), "head", null);
        setLongField(term4096, term4096.getClass(), "queueLength", -1468719814009985452L);
        setField(term4095, term4095.getClass(), "queue", term4096);
        setField(term4095, term4095.getClass(), "next", null);
        setField(term4095, term4095.getClass(), "discovered", null);
        setField(term4073, term4073.getClass(), "shadowChildrenRef", term4095);
        setField(term4073, term4073.getClass(), "childNodes", term4099);
        setIntField(term4103, term4103.getClass(), "size", 890669485);
        setField(term4103, term4103.getClass(), "keys", term4105);
        setField(term4103, term4103.getClass(), "vals", term4106);
        setField(term4073, term4073.getClass(), "attributes", term4103);
        setField(term4073, term4073.getClass(), "baseUri", "EYtfuJaxiM");
        setField(term4073, term4073.getClass(), "parentNode", null);
        setIntField(term4073, term4073.getClass(), "siblingIndex", 691577392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "lastElementSibling", argTypes, term4073, args);
    }

};



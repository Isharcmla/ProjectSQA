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

public class Element_ownText_186502842983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6436;
     Object term6483;

    public Element_ownText_186502842983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6462 = new ArrayList();
        ((ArrayList) term6462).add((Object)null);
        ((ArrayList) term6462).add((Object)null);
        ((ArrayList) term6462).add((Object)null);
        ((ArrayList) term6462).add((Object)null);
        ((ArrayList) term6462).add((Object)null);
        ((ArrayList) term6462).add((Object)null);
        ((ArrayList) term6462).add((Object)null);
        term6436 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6437 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6458 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term6459 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term6460 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term6466 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6468 = (Object[]) newArray("java.lang.String", 0);
        Object[] term6469 = (Object[]) newArray("java.lang.String", 0);
        setField(term6437, term6437.getClass(), "tagName", "FwPbDZcHmB");
        setBooleanField(term6437, term6437.getClass(), "isBlock", true);
        setBooleanField(term6437, term6437.getClass(), "formatAsBlock", true);
        setBooleanField(term6437, term6437.getClass(), "canContainInline", false);
        setBooleanField(term6437, term6437.getClass(), "empty", false);
        setBooleanField(term6437, term6437.getClass(), "selfClosing", false);
        setBooleanField(term6437, term6437.getClass(), "preserveWhitespace", false);
        setBooleanField(term6437, term6437.getClass(), "formList", false);
        setBooleanField(term6437, term6437.getClass(), "formSubmit", false);
        setField(term6436, term6436.getClass(), "tag", term6437);
        setField(term6458, term6458.getClass(), "referent", null);
        setField(term6459, term6459.getClass(), "lock", term6460);
        setField(term6459, term6459.getClass(), "head", null);
        setLongField(term6459, term6459.getClass(), "queueLength", 7862575738391801707L);
        setField(term6458, term6458.getClass(), "queue", term6459);
        setField(term6458, term6458.getClass(), "next", null);
        setField(term6458, term6458.getClass(), "discovered", null);
        setField(term6436, term6436.getClass(), "shadowChildrenRef", term6458);
        setField(term6436, term6436.getClass(), "childNodes", term6462);
        setIntField(term6466, term6466.getClass(), "size", -1618206977);
        setField(term6466, term6466.getClass(), "keys", term6468);
        setField(term6466, term6466.getClass(), "vals", term6469);
        setField(term6436, term6436.getClass(), "attributes", term6466);
        setField(term6436, term6436.getClass(), "baseUri", "hOncybyCAH");
        setField(term6436, term6436.getClass(), "parentNode", null);
        setIntField(term6436, term6436.getClass(), "siblingIndex", -1747406163);
        term6483 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6484 = (byte[]) newByteArray(16);
        setField(term6483, term6483.getClass(), "value", term6484);
        setByteField(term6483, term6483.getClass(), "coder", (byte) 47);
        setIntField(term6483, term6483.getClass(), "count", 388157121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = term6483;
        callMethod(klass, "ownText", argTypes, term6436, args);
    }

};



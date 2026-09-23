package org.apache.commons.jxpath.ri.model.beans;

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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.beans.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NullPropertyPointer_createChild_1419654292127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409241;

    public NullPropertyPointer_createChild_1419654292127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term409241 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term409367 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term409493 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term409619 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term409745 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term409871 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term409997 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term410123 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term410249 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term410375 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term410501 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term410627 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term410753 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term410879 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term411005 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term411131 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term411257 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term411383 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term411509 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term411635 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term411761 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term411887 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term412013 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term412139 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term412265 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term412391 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term412517 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term412643 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term412769 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term412895 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term413021 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term413147 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term413273 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term413399 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term413525 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term413651 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term413777 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term413887 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPointer"));
        setField(term413777, term413777.getClass(), "parent", term413887);
        setField(term413651, term413651.getClass(), "parent", term413777);
        setField(term413525, term413525.getClass(), "parent", term413651);
        setField(term413399, term413399.getClass(), "parent", term413525);
        setField(term413273, term413273.getClass(), "parent", term413399);
        setField(term413147, term413147.getClass(), "parent", term413273);
        setField(term413021, term413021.getClass(), "parent", term413147);
        setField(term412895, term412895.getClass(), "parent", term413021);
        setField(term412769, term412769.getClass(), "parent", term412895);
        setField(term412643, term412643.getClass(), "parent", term412769);
        setField(term412517, term412517.getClass(), "parent", term412643);
        setField(term412391, term412391.getClass(), "parent", term412517);
        setField(term412265, term412265.getClass(), "parent", term412391);
        setField(term412139, term412139.getClass(), "parent", term412265);
        setField(term412013, term412013.getClass(), "parent", term412139);
        setField(term411887, term411887.getClass(), "parent", term412013);
        setField(term411761, term411761.getClass(), "parent", term411887);
        setField(term411635, term411635.getClass(), "parent", term411761);
        setField(term411509, term411509.getClass(), "parent", term411635);
        setField(term411383, term411383.getClass(), "parent", term411509);
        setField(term411257, term411257.getClass(), "parent", term411383);
        setField(term411131, term411131.getClass(), "parent", term411257);
        setField(term411005, term411005.getClass(), "parent", term411131);
        setField(term410879, term410879.getClass(), "parent", term411005);
        setField(term410753, term410753.getClass(), "parent", term410879);
        setField(term410627, term410627.getClass(), "parent", term410753);
        setField(term410501, term410501.getClass(), "parent", term410627);
        setField(term410375, term410375.getClass(), "parent", term410501);
        setField(term410249, term410249.getClass(), "parent", term410375);
        setField(term410123, term410123.getClass(), "parent", term410249);
        setField(term409997, term409997.getClass(), "parent", term410123);
        setField(term409871, term409871.getClass(), "parent", term409997);
        setField(term409745, term409745.getClass(), "parent", term409871);
        setField(term409619, term409619.getClass(), "parent", term409745);
        setField(term409493, term409493.getClass(), "parent", term409619);
        setField(term409367, term409367.getClass(), "parent", term409493);
        setField(term409241, term409241.getClass(), "parent", term409367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.Object");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = 0;
        args[3] = null;
        try {
            callMethod(klass, "createChild", argTypes, term409241, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



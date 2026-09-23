package org.apache.commons.jxpath.ri.model.dom;

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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DOMNodePointer_createAttribute_149645840317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122454;

    public DOMNodePointer_createAttribute_149645840317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122454 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term122536 = newInstance(Class.forName("org.apache.html.dom.HTMLModElementImpl"));
        Object term122648 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term122760 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term122872 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term122984 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term123096 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term123208 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term123320 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term123432 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term123544 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term123656 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term123768 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term123880 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term123992 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term124104 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term124216 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term124328 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term124440 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term124552 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term124664 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term124776 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term124888 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term125000 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term125112 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term125224 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term125336 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term125448 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term125560 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term125672 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term125784 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term125896 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term126008 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term126120 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term126232 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term126344 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term126456 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term126568 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term126680 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term126792 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term126904 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term127016 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term127128 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term127240 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term127352 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term127464 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term127576 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term127688 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term127800 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term127912 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term128024 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term122454, term122454.getClass(), "node", term122536);
        setField(term122454, term122454.getClass(), "id", null);
        setField(term122648, term122648.getClass(), "id", null);
        setField(term122760, term122760.getClass(), "id", null);
        setField(term122872, term122872.getClass(), "id", null);
        setField(term122984, term122984.getClass(), "id", null);
        setField(term123096, term123096.getClass(), "id", null);
        setField(term123208, term123208.getClass(), "id", null);
        setField(term123320, term123320.getClass(), "id", null);
        setField(term123432, term123432.getClass(), "id", null);
        setField(term123544, term123544.getClass(), "id", null);
        setField(term123656, term123656.getClass(), "id", null);
        setField(term123768, term123768.getClass(), "id", null);
        setField(term123880, term123880.getClass(), "id", null);
        setField(term123992, term123992.getClass(), "id", null);
        setField(term124104, term124104.getClass(), "id", null);
        setField(term124216, term124216.getClass(), "id", null);
        setField(term124328, term124328.getClass(), "id", null);
        setField(term124440, term124440.getClass(), "id", null);
        setField(term124552, term124552.getClass(), "id", null);
        setField(term124664, term124664.getClass(), "id", null);
        setField(term124776, term124776.getClass(), "id", null);
        setField(term124888, term124888.getClass(), "id", null);
        setField(term125000, term125000.getClass(), "id", null);
        setField(term125112, term125112.getClass(), "id", null);
        setField(term125224, term125224.getClass(), "id", null);
        setField(term125336, term125336.getClass(), "id", null);
        setField(term125448, term125448.getClass(), "id", null);
        setField(term125560, term125560.getClass(), "id", null);
        setField(term125672, term125672.getClass(), "id", null);
        setField(term125784, term125784.getClass(), "id", null);
        setField(term125896, term125896.getClass(), "id", null);
        setField(term126008, term126008.getClass(), "id", null);
        setField(term126120, term126120.getClass(), "id", null);
        setField(term126232, term126232.getClass(), "id", null);
        setField(term126344, term126344.getClass(), "id", null);
        setField(term126456, term126456.getClass(), "id", null);
        setField(term126568, term126568.getClass(), "id", null);
        setField(term126680, term126680.getClass(), "id", null);
        setField(term126792, term126792.getClass(), "id", null);
        setField(term126904, term126904.getClass(), "id", null);
        setField(term127016, term127016.getClass(), "id", null);
        setField(term127128, term127128.getClass(), "id", null);
        setField(term127240, term127240.getClass(), "id", null);
        setField(term127352, term127352.getClass(), "id", null);
        setField(term127464, term127464.getClass(), "id", null);
        setField(term127576, term127576.getClass(), "id", null);
        setField(term127688, term127688.getClass(), "id", null);
        setField(term127800, term127800.getClass(), "id", null);
        setField(term127912, term127912.getClass(), "id", null);
        setField(term128024, term128024.getClass(), "id", "");
        setField(term127912, term127912.getClass(), "parent", term128024);
        setField(term127800, term127800.getClass(), "parent", term127912);
        setField(term127688, term127688.getClass(), "parent", term127800);
        setField(term127576, term127576.getClass(), "parent", term127688);
        setField(term127464, term127464.getClass(), "parent", term127576);
        setField(term127352, term127352.getClass(), "parent", term127464);
        setField(term127240, term127240.getClass(), "parent", term127352);
        setField(term127128, term127128.getClass(), "parent", term127240);
        setField(term127016, term127016.getClass(), "parent", term127128);
        setField(term126904, term126904.getClass(), "parent", term127016);
        setField(term126792, term126792.getClass(), "parent", term126904);
        setField(term126680, term126680.getClass(), "parent", term126792);
        setField(term126568, term126568.getClass(), "parent", term126680);
        setField(term126456, term126456.getClass(), "parent", term126568);
        setField(term126344, term126344.getClass(), "parent", term126456);
        setField(term126232, term126232.getClass(), "parent", term126344);
        setField(term126120, term126120.getClass(), "parent", term126232);
        setField(term126008, term126008.getClass(), "parent", term126120);
        setField(term125896, term125896.getClass(), "parent", term126008);
        setField(term125784, term125784.getClass(), "parent", term125896);
        setField(term125672, term125672.getClass(), "parent", term125784);
        setField(term125560, term125560.getClass(), "parent", term125672);
        setField(term125448, term125448.getClass(), "parent", term125560);
        setField(term125336, term125336.getClass(), "parent", term125448);
        setField(term125224, term125224.getClass(), "parent", term125336);
        setField(term125112, term125112.getClass(), "parent", term125224);
        setField(term125000, term125000.getClass(), "parent", term125112);
        setField(term124888, term124888.getClass(), "parent", term125000);
        setField(term124776, term124776.getClass(), "parent", term124888);
        setField(term124664, term124664.getClass(), "parent", term124776);
        setField(term124552, term124552.getClass(), "parent", term124664);
        setField(term124440, term124440.getClass(), "parent", term124552);
        setField(term124328, term124328.getClass(), "parent", term124440);
        setField(term124216, term124216.getClass(), "parent", term124328);
        setField(term124104, term124104.getClass(), "parent", term124216);
        setField(term123992, term123992.getClass(), "parent", term124104);
        setField(term123880, term123880.getClass(), "parent", term123992);
        setField(term123768, term123768.getClass(), "parent", term123880);
        setField(term123656, term123656.getClass(), "parent", term123768);
        setField(term123544, term123544.getClass(), "parent", term123656);
        setField(term123432, term123432.getClass(), "parent", term123544);
        setField(term123320, term123320.getClass(), "parent", term123432);
        setField(term123208, term123208.getClass(), "parent", term123320);
        setField(term123096, term123096.getClass(), "parent", term123208);
        setField(term122984, term122984.getClass(), "parent", term123096);
        setField(term122872, term122872.getClass(), "parent", term122984);
        setField(term122760, term122760.getClass(), "parent", term122872);
        setField(term122648, term122648.getClass(), "parent", term122760);
        setField(term122454, term122454.getClass(), "parent", term122648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "createAttribute", argTypes, term122454, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



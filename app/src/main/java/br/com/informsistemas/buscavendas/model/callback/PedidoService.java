package br.com.informsistemas.buscavendas.model.callback;

import br.com.informsistemas.buscavendas.controller.rest.Request.RequestPedido;
import br.com.informsistemas.buscavendas.controller.rest.Response.ResponsePedido;
import br.com.informsistemas.buscavendas.model.helper.Constants;
import br.com.informsistemas.buscavendas.model.pojo.RestResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface PedidoService {

    @POST(Constants.URL.PEDIDO_GERAR)
    Call<RestResponse<ResponsePedido>> postPedido(@Body RequestPedido requestPedido);
}
